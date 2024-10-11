# NullableIntegration

GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | [optional] 
**client_secret** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**description** | **str** |  | 
**events** | **List[str]** | The list of events for the GitHub app | 
**external_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the GitHub app | 
**installations_count** | **int** | The number of installations associated with the GitHub app | [optional] 
**name** | **str** | The name of the GitHub app | 
**node_id** | **str** |  | 
**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**pem** | **str** |  | [optional] 
**permissions** | [**IntegrationPermissions**](IntegrationPermissions.md) |  | 
**slug** | **str** | The slug name of the GitHub app | [optional] 
**updated_at** | **datetime** |  | 
**webhook_secret** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.nullable_integration import NullableIntegration

# TODO update the JSON string below
json = "{}"
# create an instance of NullableIntegration from a JSON string
nullable_integration_instance = NullableIntegration.from_json(json)
# print the JSON string representation of the object
print(NullableIntegration.to_json())

# convert the object into a dict
nullable_integration_dict = nullable_integration_instance.to_dict()
# create an instance of NullableIntegration from a dict
nullable_integration_from_dict = NullableIntegration.from_dict(nullable_integration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


