# MessageConfigurationBaiduMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_small_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**json_body** | **str** |  | [optional] 
**media_url** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.message_configuration_baidu_message import MessageConfigurationBaiduMessage

# TODO update the JSON string below
json = "{}"
# create an instance of MessageConfigurationBaiduMessage from a JSON string
message_configuration_baidu_message_instance = MessageConfigurationBaiduMessage.from_json(json)
# print the JSON string representation of the object
print(MessageConfigurationBaiduMessage.to_json())

# convert the object into a dict
message_configuration_baidu_message_dict = message_configuration_baidu_message_instance.to_dict()
# create an instance of MessageConfigurationBaiduMessage from a dict
message_configuration_baidu_message_from_dict = MessageConfigurationBaiduMessage.from_dict(message_configuration_baidu_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


