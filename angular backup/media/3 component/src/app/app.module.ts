import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaComponent } from './media/media.component';
import { MediaListComponent } from './media-list/media-list.component';
import { MediaEntryComponent } from './media-entry/media-entry.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaComponent,
    MediaListComponent,
    MediaEntryComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
