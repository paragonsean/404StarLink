

# GoogleChromeManagementV1TelemetryUserDevice

Telemetry data collected for a managed user and device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audioStatusReport** | [**List&lt;GoogleChromeManagementV1AudioStatusReport&gt;**](GoogleChromeManagementV1AudioStatusReport.md) | Output only. Audio reports collected periodically sorted in a decreasing order of report_time. |  [optional] [readonly] |
|**deviceId** | **String** | The unique Directory API ID of the device. This value is the same as the Admin Console&#39;s Directory API ID in the ChromeOS Devices tab. |  [optional] |
|**peripheralsReport** | [**List&lt;GoogleChromeManagementV1PeripheralsReport&gt;**](GoogleChromeManagementV1PeripheralsReport.md) | Output only. Peripherals reports collected periodically sorted in a decreasing order of report_time. |  [optional] [readonly] |



