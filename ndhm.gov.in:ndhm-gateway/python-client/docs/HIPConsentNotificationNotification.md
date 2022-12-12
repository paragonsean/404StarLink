# HIPConsentNotificationNotification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent_detail** | [**HIPConsentNotificationNotificationConsentDetail**](HIPConsentNotificationNotificationConsentDetail.md) |  | 
**consent_id** | **str** |  | 
**signature** | **str** |  | 
**status** | [**ConsentStatus**](ConsentStatus.md) |  | 

## Example

```python
from openapi_client.models.hip_consent_notification_notification import HIPConsentNotificationNotification

# TODO update the JSON string below
json = "{}"
# create an instance of HIPConsentNotificationNotification from a JSON string
hip_consent_notification_notification_instance = HIPConsentNotificationNotification.from_json(json)
# print the JSON string representation of the object
print(HIPConsentNotificationNotification.to_json())

# convert the object into a dict
hip_consent_notification_notification_dict = hip_consent_notification_notification_instance.to_dict()
# create an instance of HIPConsentNotificationNotification from a dict
hip_consent_notification_notification_from_dict = HIPConsentNotificationNotification.from_dict(hip_consent_notification_notification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


