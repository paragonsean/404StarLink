# GCMMessage

Specifies the settings for a one-time message that's sent directly to an endpoint through the GCM channel. The GCM channel enables Amazon Pinpoint to send messages to the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**collapse_key** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**icon_reference** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**priority** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**restricted_package_name** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.gcm_message import GCMMessage

# TODO update the JSON string below
json = "{}"
# create an instance of GCMMessage from a JSON string
gcm_message_instance = GCMMessage.from_json(json)
# print the JSON string representation of the object
print(GCMMessage.to_json())

# convert the object into a dict
gcm_message_dict = gcm_message_instance.to_dict()
# create an instance of GCMMessage from a dict
gcm_message_from_dict = GCMMessage.from_dict(gcm_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


