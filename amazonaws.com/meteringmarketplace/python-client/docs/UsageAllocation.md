# UsageAllocation

<p>Usage allocations allow you to split usage into buckets by tags.</p> <p>Each <code>UsageAllocation</code> indicates the usage quantity for a specific set of tags.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocated_usage_quantity** | **int** |  | 
**tags** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.usage_allocation import UsageAllocation

# TODO update the JSON string below
json = "{}"
# create an instance of UsageAllocation from a JSON string
usage_allocation_instance = UsageAllocation.from_json(json)
# print the JSON string representation of the object
print(UsageAllocation.to_json())

# convert the object into a dict
usage_allocation_dict = usage_allocation_instance.to_dict()
# create an instance of UsageAllocation from a dict
usage_allocation_from_dict = UsageAllocation.from_dict(usage_allocation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


