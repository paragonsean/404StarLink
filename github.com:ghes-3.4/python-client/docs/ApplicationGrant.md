# ApplicationGrant

The authorization associated with an OAuth Access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app** | [**ApplicationGrantApp**](ApplicationGrantApp.md) |  | 
**created_at** | **datetime** |  | 
**id** | **int** |  | 
**scopes** | **List[str]** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.application_grant import ApplicationGrant

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationGrant from a JSON string
application_grant_instance = ApplicationGrant.from_json(json)
# print the JSON string representation of the object
print(ApplicationGrant.to_json())

# convert the object into a dict
application_grant_dict = application_grant_instance.to_dict()
# create an instance of ApplicationGrant from a dict
application_grant_from_dict = ApplicationGrant.from_dict(application_grant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


