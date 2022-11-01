# ApiOverview

Api Overview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependabot** | **List[str]** |  | [optional] 
**installed_version** | **str** |  | [optional] 
**packages** | **List[str]** |  | [optional] 
**verifiable_password_authentication** | **bool** |  | 

## Example

```python
from openapi_client.models.api_overview import ApiOverview

# TODO update the JSON string below
json = "{}"
# create an instance of ApiOverview from a JSON string
api_overview_instance = ApiOverview.from_json(json)
# print the JSON string representation of the object
print(ApiOverview.to_json())

# convert the object into a dict
api_overview_dict = api_overview_instance.to_dict()
# create an instance of ApiOverview from a dict
api_overview_from_dict = ApiOverview.from_dict(api_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


