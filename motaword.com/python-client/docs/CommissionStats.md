# CommissionStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | [**Monetary**](Monetary.md) |  | [optional] 
**paid** | [**Monetary**](Monetary.md) |  | [optional] 
**quote_total** | [**Monetary**](Monetary.md) |  | [optional] 
**total** | [**Monetary**](Monetary.md) |  | [optional] 

## Example

```python
from openapi_client.models.commission_stats import CommissionStats

# TODO update the JSON string below
json = "{}"
# create an instance of CommissionStats from a JSON string
commission_stats_instance = CommissionStats.from_json(json)
# print the JSON string representation of the object
print(CommissionStats.to_json())

# convert the object into a dict
commission_stats_dict = commission_stats_instance.to_dict()
# create an instance of CommissionStats from a dict
commission_stats_from_dict = CommissionStats.from_dict(commission_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


