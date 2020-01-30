import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { ErrorComponent } from './error/error.component';
import { ProductAddComponent } from './products/product-add/product-add.component';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { ProductListComponent } from './products/product-list/product-list.component.spec';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    MenuComponent,
    SearchComponent,
    LoginComponent,
    LogoutComponent,
    ErrorComponent,
    ProductAddComponent,
    ErrorComponent,
    ProductListComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
