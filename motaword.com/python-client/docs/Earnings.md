# Earnings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | [**List[EarningWithTQS]**](EarningWithTQS.md) |  | [optional] 
**ongoing** | [**List[EarningWithTQS]**](EarningWithTQS.md) |  | [optional] 
**total** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.earnings import Earnings

# TODO update the JSON string below
json = "{}"
# create an instance of Earnings from a JSON string
earnings_instance = Earnings.from_json(json)
# print the JSON string representation of the object
print(Earnings.to_json())

# convert the object into a dict
earnings_dict = earnings_instance.to_dict()
# create an instance of Earnings from a dict
earnings_from_dict = Earnings.from_dict(earnings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


