# EsamSignalProcessingNotification

ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scc_xml** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.esam_signal_processing_notification import EsamSignalProcessingNotification

# TODO update the JSON string below
json = "{}"
# create an instance of EsamSignalProcessingNotification from a JSON string
esam_signal_processing_notification_instance = EsamSignalProcessingNotification.from_json(json)
# print the JSON string representation of the object
print(EsamSignalProcessingNotification.to_json())

# convert the object into a dict
esam_signal_processing_notification_dict = esam_signal_processing_notification_instance.to_dict()
# create an instance of EsamSignalProcessingNotification from a dict
esam_signal_processing_notification_from_dict = EsamSignalProcessingNotification.from_dict(esam_signal_processing_notification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


