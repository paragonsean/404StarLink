# ClientStringStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language_counts** | [**List[LanguageStringStat]**](LanguageStringStat.md) |  | [optional] 
**total_project_strings_count** | **int** |  | [optional] 
**total_tm_strings_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.client_string_stats import ClientStringStats

# TODO update the JSON string below
json = "{}"
# create an instance of ClientStringStats from a JSON string
client_string_stats_instance = ClientStringStats.from_json(json)
# print the JSON string representation of the object
print(ClientStringStats.to_json())

# convert the object into a dict
client_string_stats_dict = client_string_stats_instance.to_dict()
# create an instance of ClientStringStats from a dict
client_string_stats_from_dict = ClientStringStats.from_dict(client_string_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


