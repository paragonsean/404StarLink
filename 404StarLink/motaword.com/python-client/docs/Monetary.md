# Monetary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] [default to 'usd']

## Example

```python
from openapi_client.models.monetary import Monetary

# TODO update the JSON string below
json = "{}"
# create an instance of Monetary from a JSON string
monetary_instance = Monetary.from_json(json)
# print the JSON string representation of the object
print(Monetary.to_json())

# convert the object into a dict
monetary_dict = monetary_instance.to_dict()
# create an instance of Monetary from a dict
monetary_from_dict = Monetary.from_dict(monetary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


