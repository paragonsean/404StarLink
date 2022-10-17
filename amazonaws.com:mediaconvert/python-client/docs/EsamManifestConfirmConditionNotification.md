# EsamManifestConfirmConditionNotification

ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mcc_xml** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.esam_manifest_confirm_condition_notification import EsamManifestConfirmConditionNotification

# TODO update the JSON string below
json = "{}"
# create an instance of EsamManifestConfirmConditionNotification from a JSON string
esam_manifest_confirm_condition_notification_instance = EsamManifestConfirmConditionNotification.from_json(json)
# print the JSON string representation of the object
print(EsamManifestConfirmConditionNotification.to_json())

# convert the object into a dict
esam_manifest_confirm_condition_notification_dict = esam_manifest_confirm_condition_notification_instance.to_dict()
# create an instance of EsamManifestConfirmConditionNotification from a dict
esam_manifest_confirm_condition_notification_from_dict = EsamManifestConfirmConditionNotification.from_dict(esam_manifest_confirm_condition_notification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


