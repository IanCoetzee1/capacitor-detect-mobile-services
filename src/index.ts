import { registerPlugin } from '@capacitor/core';

import type { DetectMobileServicesPlugin } from './definitions';

const DetectMobileServices = registerPlugin<DetectMobileServicesPlugin>(
  'DetectMobileServices',
  {
    web: () => import('./web').then(m => new m.DetectMobileServicesWeb()),
  },
);

export * from './definitions';
export { DetectMobileServices };
