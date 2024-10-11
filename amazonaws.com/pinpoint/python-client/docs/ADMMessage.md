# ADMMessage

Specifies the settings for a one-time message that's sent directly to an endpoint through the ADM (Amazon Device Messaging) channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**consolidation_key** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**expires_after** | **str** |  | [optional] 
**icon_reference** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**md5** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.adm_message import ADMMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ADMMessage from a JSON string
adm_message_instance = ADMMessage.from_json(json)
# print the JSON string representation of the object
print(ADMMessage.to_json())

# convert the object into a dict
adm_message_dict = adm_message_instance.to_dict()
# create an instance of ADMMessage from a dict
adm_message_from_dict = ADMMessage.from_dict(adm_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


