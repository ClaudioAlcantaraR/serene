import { bootstrapApplication } from '@angular/platform-browser';
import { provideHttpClient } from '@angular/common/http';
import { App } from './app/app';
import { appConfig } from './app/app.config';

bootstrapApplication(App, {
  providers: [
    ...appConfig.providers,
    provideHttpClient() // Asegura HttpClient disponible para AuthService, etc.
  ]
}).catch((err) => console.error(err));
