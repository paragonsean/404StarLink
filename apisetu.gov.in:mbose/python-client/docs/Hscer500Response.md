# Hscer500Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hscer500_response import Hscer500Response

# TODO update the JSON string below
json = "{}"
# create an instance of Hscer500Response from a JSON string
hscer500_response_instance = Hscer500Response.from_json(json)
# print the JSON string representation of the object
print(Hscer500Response.to_json())

# convert the object into a dict
hscer500_response_dict = hscer500_response_instance.to_dict()
# create an instance of Hscer500Response from a dict
hscer500_response_from_dict = Hscer500Response.from_dict(hscer500_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


