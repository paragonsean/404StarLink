# EnterpriseGistOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**private_gists** | **int** |  | 
**public_gists** | **int** |  | 
**total_gists** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_gist_overview import EnterpriseGistOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseGistOverview from a JSON string
enterprise_gist_overview_instance = EnterpriseGistOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseGistOverview.to_json())

# convert the object into a dict
enterprise_gist_overview_dict = enterprise_gist_overview_instance.to_dict()
# create an instance of EnterpriseGistOverview from a dict
enterprise_gist_overview_from_dict = EnterpriseGistOverview.from_dict(enterprise_gist_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


