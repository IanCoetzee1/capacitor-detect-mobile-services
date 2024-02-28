import {WebPlugin} from '@capacitor/core';

import type {DetectMobileServicesPlugin} from './definitions';

export class DetectMobileServicesWeb
    extends WebPlugin
    implements DetectMobileServicesPlugin {

    async GetMediaService(): Promise<{ value: string }> {
        return Promise.resolve({ value: "web" });
    }

    HasHMS(): Promise<{ value: boolean }> {
        return Promise.resolve({ value: false });
    }

    HasGMS(): Promise<{ value: boolean }> {
        return Promise.resolve({ value: false });
    }
}
