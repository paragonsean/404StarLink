# EarningWithTQS


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
**is_above_average** | **bool** | Is this score above or below the average among other vendors in the same project? | [optional] 
**score** | **float** |  | [optional] 
**strings_edited** | **int** | The number of translated strings by this translator which was edited by a proofreader. | [optional] 
**strings_translated** | **int** | The number of translated strings by this translator. | [optional] 
**project_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.earning_with_tqs import EarningWithTQS

# TODO update the JSON string below
json = "{}"
# create an instance of EarningWithTQS from a JSON string
earning_with_tqs_instance = EarningWithTQS.from_json(json)
# print the JSON string representation of the object
print(EarningWithTQS.to_json())

# convert the object into a dict
earning_with_tqs_dict = earning_with_tqs_instance.to_dict()
# create an instance of EarningWithTQS from a dict
earning_with_tqs_from_dict = EarningWithTQS.from_dict(earning_with_tqs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


