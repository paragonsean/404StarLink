# ClientProjectStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stats** | [**List[ClientProjectStat]**](ClientProjectStat.md) |  | [optional] 

## Example

```python
from openapi_client.models.client_project_stats import ClientProjectStats

# TODO update the JSON string below
json = "{}"
# create an instance of ClientProjectStats from a JSON string
client_project_stats_instance = ClientProjectStats.from_json(json)
# print the JSON string representation of the object
print(ClientProjectStats.to_json())

# convert the object into a dict
client_project_stats_dict = client_project_stats_instance.to_dict()
# create an instance of ClientProjectStats from a dict
client_project_stats_from_dict = ClientProjectStats.from_dict(client_project_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


