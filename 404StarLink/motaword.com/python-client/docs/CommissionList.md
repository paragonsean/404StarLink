# CommissionList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commissions** | [**List[Commission]**](Commission.md) |  | [optional] 
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.commission_list import CommissionList

# TODO update the JSON string below
json = "{}"
# create an instance of CommissionList from a JSON string
commission_list_instance = CommissionList.from_json(json)
# print the JSON string representation of the object
print(CommissionList.to_json())

# convert the object into a dict
commission_list_dict = commission_list_instance.to_dict()
# create an instance of CommissionList from a dict
commission_list_from_dict = CommissionList.from_dict(commission_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


