# Commission


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Monetary**](Monetary.md) |  | [optional] 
**var_date** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**project** | [**Project**](Project.md) |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.commission import Commission

# TODO update the JSON string below
json = "{}"
# create an instance of Commission from a JSON string
commission_instance = Commission.from_json(json)
# print the JSON string representation of the object
print(Commission.to_json())

# convert the object into a dict
commission_dict = commission_instance.to_dict()
# create an instance of Commission from a dict
commission_from_dict = Commission.from_dict(commission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


