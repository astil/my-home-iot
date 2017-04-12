import {Component, OnInit} from '@angular/core';
import {Moisture} from "./domain/moisture";
import {MyIotRestService} from "./service/my-iot-rest.service";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    providers: [MyIotRestService],
    styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
    title = 'Hjemme IoT';
    pieChartOptions: any;
    temp: String;
    private errorMessage: any;

    constructor(private restService: MyIotRestService) {
    }

    ngOnInit(): void {
        this.restService.getLastMoisture().subscribe(
            data => this.processMoistureResult(data),
            error => this.errorMessage = <any>error
        );

        this.restService.getLastTemp().subscribe(
            data => this.processTempResult(data),
            error => this.errorMessage = <any>error
        );
    }

    processTempResult(data): void {
        this.temp = data.temp;
    }

    processMoistureResult(data): void {
        // 422 is the value in dry air
        let chartValue = (data.analogValue * 100) / 422;
        // revert value for the chart
        chartValue = 100 - chartValue;

        this.pieChartOptions = {
            chartType: 'Gauge',
            dataTable: [
                ['Label', 'Moisture'],
                ['Moisture', +chartValue.toFixed(0)]
            ],
            options: {
                animation: {easing: 'out'},
                width: 150, height: 150,
                greenFrom: 60, greenTo: 100,
                yellowFrom: 30, yellowTo: 60,
                redFrom: 0, redTo: 30,
                minorTicks: 5,
                min: 0, max: 100,
                majorTicks: ['0', '20', '40', '60', '80', '100'],
                greenColor: '#d0e9c6',
                yellowColor: '#e7e975',
                redColor: '#e38b85'
            }
        };
    }
}
