# Earning


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] [default to 'usd']
**due_date** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**status** | **str** |  | [optional] 
**words** | **int** |  | [optional] 
**words_approved** | **int** |  | [optional] 
**words_translated** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.earning import Earning

# TODO update the JSON string below
json = "{}"
# create an instance of Earning from a JSON string
earning_instance = Earning.from_json(json)
# print the JSON string representation of the object
print(Earning.to_json())

# convert the object into a dict
earning_dict = earning_instance.to_dict()
# create an instance of Earning from a dict
earning_from_dict = Earning.from_dict(earning_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


