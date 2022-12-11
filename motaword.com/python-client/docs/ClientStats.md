# ClientStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_count** | **int** |  | [optional] 
**nps** | **float** |  | [optional] 
**started_project_count** | **int** |  | [optional] 
**total_discounted** | [**Monetary**](Monetary.md) |  | [optional] 
**total_project_count** | **int** |  | [optional] 
**total_spending** | **float** |  | [optional] 
**translator_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.client_stats import ClientStats

# TODO update the JSON string below
json = "{}"
# create an instance of ClientStats from a JSON string
client_stats_instance = ClientStats.from_json(json)
# print the JSON string representation of the object
print(ClientStats.to_json())

# convert the object into a dict
client_stats_dict = client_stats_instance.to_dict()
# create an instance of ClientStats from a dict
client_stats_from_dict = ClientStats.from_dict(client_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


