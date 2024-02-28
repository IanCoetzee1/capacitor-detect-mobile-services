export interface DetectMobileServicesPlugin {
    GetMediaService(): Promise<{ value: string }>;
    HasHMS(): Promise<{ value: boolean }>;
    HasGMS(): Promise<{ value: boolean }>;
}
