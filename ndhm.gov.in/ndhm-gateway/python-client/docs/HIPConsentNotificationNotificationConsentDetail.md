# HIPConsentNotificationNotificationConsentDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**care_contexts** | [**List[ConsentArtefactResponseConsentConsentDetailCareContextsInner]**](ConsentArtefactResponseConsentConsentDetailCareContextsInner.md) |  | 
**consent_id** | **str** |  | 
**consent_manager** | [**HIPConsentNotificationNotificationConsentDetailConsentManager**](HIPConsentNotificationNotificationConsentDetailConsentManager.md) |  | 
**created_at** | **datetime** |  | 
**hi_types** | [**List[HITypeEnum]**](HITypeEnum.md) |  | 
**hip** | [**ConsentArtefactResponseConsentConsentDetailHip**](ConsentArtefactResponseConsentConsentDetailHip.md) |  | 
**patient** | [**ConsentManagerPatientID**](ConsentManagerPatientID.md) |  | 
**permission** | [**Permission**](Permission.md) |  | 
**purpose** | [**UsePurpose**](UsePurpose.md) |  | 
**schema_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hip_consent_notification_notification_consent_detail import HIPConsentNotificationNotificationConsentDetail

# TODO update the JSON string below
json = "{}"
# create an instance of HIPConsentNotificationNotificationConsentDetail from a JSON string
hip_consent_notification_notification_consent_detail_instance = HIPConsentNotificationNotificationConsentDetail.from_json(json)
# print the JSON string representation of the object
print(HIPConsentNotificationNotificationConsentDetail.to_json())

# convert the object into a dict
hip_consent_notification_notification_consent_detail_dict = hip_consent_notification_notification_consent_detail_instance.to_dict()
# create an instance of HIPConsentNotificationNotificationConsentDetail from a dict
hip_consent_notification_notification_consent_detail_from_dict = HIPConsentNotificationNotificationConsentDetail.from_dict(hip_consent_notification_notification_consent_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


