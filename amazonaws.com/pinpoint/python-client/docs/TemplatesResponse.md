# TemplatesResponse

Provides information about all the message templates that are associated with your Amazon Pinpoint account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.templates_response import TemplatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TemplatesResponse from a JSON string
templates_response_instance = TemplatesResponse.from_json(json)
# print the JSON string representation of the object
print(TemplatesResponse.to_json())

# convert the object into a dict
templates_response_dict = templates_response_instance.to_dict()
# create an instance of TemplatesResponse from a dict
templates_response_from_dict = TemplatesResponse.from_dict(templates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


