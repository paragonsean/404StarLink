# UpdaterecurrencesettingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_sla** | **str** |  | 
**sales_channel** | **str** |  | 

## Example

```python
from openapi_client.models.updaterecurrencesettings_request import UpdaterecurrencesettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdaterecurrencesettingsRequest from a JSON string
updaterecurrencesettings_request_instance = UpdaterecurrencesettingsRequest.from_json(json)
# print the JSON string representation of the object
print(UpdaterecurrencesettingsRequest.to_json())

# convert the object into a dict
updaterecurrencesettings_request_dict = updaterecurrencesettings_request_instance.to_dict()
# create an instance of UpdaterecurrencesettingsRequest from a dict
updaterecurrencesettings_request_from_dict = UpdaterecurrencesettingsRequest.from_dict(updaterecurrencesettings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


