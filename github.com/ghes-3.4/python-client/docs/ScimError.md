# ScimError

Scim Error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | **str** |  | [optional] 
**documentation_url** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**schemas** | **List[str]** |  | [optional] 
**scim_type** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.scim_error import ScimError

# TODO update the JSON string below
json = "{}"
# create an instance of ScimError from a JSON string
scim_error_instance = ScimError.from_json(json)
# print the JSON string representation of the object
print(ScimError.to_json())

# convert the object into a dict
scim_error_dict = scim_error_instance.to_dict()
# create an instance of ScimError from a dict
scim_error_from_dict = ScimError.from_dict(scim_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


