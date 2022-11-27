# DirectMessageConfigurationBaiduMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**icon_reference** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_baidu_message import DirectMessageConfigurationBaiduMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationBaiduMessage from a JSON string
direct_message_configuration_baidu_message_instance = DirectMessageConfigurationBaiduMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationBaiduMessage.to_json())

# convert the object into a dict
direct_message_configuration_baidu_message_dict = direct_message_configuration_baidu_message_instance.to_dict()
# create an instance of DirectMessageConfigurationBaiduMessage from a dict
direct_message_configuration_baidu_message_from_dict = DirectMessageConfigurationBaiduMessage.from_dict(direct_message_configuration_baidu_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


