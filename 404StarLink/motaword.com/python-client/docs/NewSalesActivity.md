# NewSalesActivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **str** |  | [optional] 
**timestamp** | **int** |  | [optional] 
**type** | **str** | Activity Type | [optional] 

## Example

```python
from openapi_client.models.new_sales_activity import NewSalesActivity

# TODO update the JSON string below
json = "{}"
# create an instance of NewSalesActivity from a JSON string
new_sales_activity_instance = NewSalesActivity.from_json(json)
# print the JSON string representation of the object
print(NewSalesActivity.to_json())

# convert the object into a dict
new_sales_activity_dict = new_sales_activity_instance.to_dict()
# create an instance of NewSalesActivity from a dict
new_sales_activity_from_dict = NewSalesActivity.from_dict(new_sales_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


