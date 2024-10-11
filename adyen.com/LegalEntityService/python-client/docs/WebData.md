# WebData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**web_address** | **str** | The URL of the website or the app store URL. | [optional] 
**web_address_id** | **str** | The unique identifier of the web address. | [optional] [readonly] 

## Example

```python
from openapi_client.models.web_data import WebData

# TODO update the JSON string below
json = "{}"
# create an instance of WebData from a JSON string
web_data_instance = WebData.from_json(json)
# print the JSON string representation of the object
print(WebData.to_json())

# convert the object into a dict
web_data_dict = web_data_instance.to_dict()
# create an instance of WebData from a dict
web_data_from_dict = WebData.from_dict(web_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


