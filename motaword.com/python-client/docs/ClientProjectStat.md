# ClientProjectStat


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**languages** | **List[str]** |  | [optional] 
**month** | **str** |  | [optional] 
**number_of_projects** | **int** |  | [optional] 
**total_spending** | **float** |  | [optional] 
**week** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.client_project_stat import ClientProjectStat

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProjectStat from a JSON string
client_project_stat_instance = ClientProjectStat.from_json(json)
# print the JSON string representation of the object
print(ClientProjectStat.to_json())

# convert the object into a dict
client_project_stat_dict = client_project_stat_instance.to_dict()
# create an instance of ClientProjectStat from a dict
client_project_stat_from_dict = ClientProjectStat.from_dict(client_project_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


