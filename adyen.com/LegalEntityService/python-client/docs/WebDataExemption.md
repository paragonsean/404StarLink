# WebDataExemption


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason why the web data was not provided. Possible value: **noOnlinePresence**. | [optional] 

## Example

```python
from openapi_client.models.web_data_exemption import WebDataExemption

# TODO update the JSON string below
json = "{}"
# create an instance of WebDataExemption from a JSON string
web_data_exemption_instance = WebDataExemption.from_json(json)
# print the JSON string representation of the object
print(WebDataExemption.to_json())

# convert the object into a dict
web_data_exemption_dict = web_data_exemption_instance.to_dict()
# create an instance of WebDataExemption from a dict
web_data_exemption_from_dict = WebDataExemption.from_dict(web_data_exemption_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


