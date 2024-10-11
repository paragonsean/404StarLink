# APNSMessage

Specifies the settings for a one-time message that's sent directly to an endpoint through the APNs (Apple Push Notification service) channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_push_type** | **str** |  | [optional] 
**action** | [**Action**](Action.md) |  | [optional] 
**badge** | **int** |  | [optional] 
**body** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**collapse_id** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**media_url** | **str** |  | [optional] 
**preferred_authentication_method** | **str** |  | [optional] 
**priority** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**thread_id** | **str** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.apns_message import APNSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of APNSMessage from a JSON string
apns_message_instance = APNSMessage.from_json(json)
# print the JSON string representation of the object
print(APNSMessage.to_json())

# convert the object into a dict
apns_message_dict = apns_message_instance.to_dict()
# create an instance of APNSMessage from a dict
apns_message_from_dict = APNSMessage.from_dict(apns_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


