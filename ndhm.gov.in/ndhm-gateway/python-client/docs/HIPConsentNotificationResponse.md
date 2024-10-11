# HIPConsentNotificationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acknowledgement** | [**ConsentAcknowledgement**](ConsentAcknowledgement.md) |  | [optional] 
**error** | [**Error**](Error.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.hip_consent_notification_response import HIPConsentNotificationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of HIPConsentNotificationResponse from a JSON string
hip_consent_notification_response_instance = HIPConsentNotificationResponse.from_json(json)
# print the JSON string representation of the object
print(HIPConsentNotificationResponse.to_json())

# convert the object into a dict
hip_consent_notification_response_dict = hip_consent_notification_response_instance.to_dict()
# create an instance of HIPConsentNotificationResponse from a dict
hip_consent_notification_response_from_dict = HIPConsentNotificationResponse.from_dict(hip_consent_notification_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


