

# GoogleChromeManagementV1TelemetryEvent

Telemetry data reported by a managed device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audioSevereUnderrunEvent** | **Object** | &#x60;TelemetryAudioSevereUnderrunEvent&#x60; is triggered when a audio devices run out of buffer data for more than 5 seconds. |  [optional] |
|**device** | [**GoogleChromeManagementV1TelemetryDeviceInfo**](GoogleChromeManagementV1TelemetryDeviceInfo.md) |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The event type of the current event. |  [optional] |
|**httpsLatencyChangeEvent** | [**GoogleChromeManagementV1TelemetryHttpsLatencyChangeEvent**](GoogleChromeManagementV1TelemetryHttpsLatencyChangeEvent.md) |  |  [optional] |
|**name** | **String** | Output only. Resource name of the event. |  [optional] [readonly] |
|**reportTime** | **String** | Timestamp that represents when the event was reported. |  [optional] |
|**usbPeripheralsEvent** | [**GoogleChromeManagementV1TelemetryUsbPeripheralsEvent**](GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.md) |  |  [optional] |
|**user** | [**GoogleChromeManagementV1TelemetryUserInfo**](GoogleChromeManagementV1TelemetryUserInfo.md) |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| EVENT_TYPE_UNSPECIFIED | &quot;EVENT_TYPE_UNSPECIFIED&quot; |
| AUDIO_SEVERE_UNDERRUN | &quot;AUDIO_SEVERE_UNDERRUN&quot; |
| USB_ADDED | &quot;USB_ADDED&quot; |
| USB_REMOVED | &quot;USB_REMOVED&quot; |
| NETWORK_HTTPS_LATENCY_CHANGE | &quot;NETWORK_HTTPS_LATENCY_CHANGE&quot; |



