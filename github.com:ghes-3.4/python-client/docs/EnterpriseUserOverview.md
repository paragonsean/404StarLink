# EnterpriseUserOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin_users** | **int** |  | 
**suspended_users** | **int** |  | 
**total_users** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_user_overview import EnterpriseUserOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseUserOverview from a JSON string
enterprise_user_overview_instance = EnterpriseUserOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseUserOverview.to_json())

# convert the object into a dict
enterprise_user_overview_dict = enterprise_user_overview_instance.to_dict()
# create an instance of EnterpriseUserOverview from a dict
enterprise_user_overview_from_dict = EnterpriseUserOverview.from_dict(enterprise_user_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


