import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router, CanActivate } from '@angular/router';
import { AuthenticationService } from './authentication.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate{

   constructor(public auth : AuthenticationService, public router : Router) { }

   canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
 
       if(this.auth.isUserLoggedIn())
           return true;
       else{
         this.router.navigate(['/login']);
         return false;
       }    
           
   }
 
 }