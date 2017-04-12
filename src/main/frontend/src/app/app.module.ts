import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {Ng2GoogleChartsModule} from "ng2-google-charts";
import {MyIotRestService} from "./service/my-iot-rest.service";

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        Ng2GoogleChartsModule
    ],
    providers: [MyIotRestService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
