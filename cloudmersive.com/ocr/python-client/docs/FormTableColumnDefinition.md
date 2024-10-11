# FormTableColumnDefinition

Definition of a column within a table for OCR data extraction from images

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_numeric_digits** | **bool** | Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits | [optional] 
**anchor_mode** | **str** | Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial. | [optional] 
**column_id** | **str** | The identifier of the field; use this to identify which field is being referenced | [optional] 
**data_type** | **str** | The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace) | [optional] 
**minimum_character_count** | **int** | Optional - the target number of digits in the field; useful for fixed-length fields | [optional] 
**top_anchor** | **str** | Optional - the top anchor of the column heading | [optional] 

## Example

```python
from openapi_client.models.form_table_column_definition import FormTableColumnDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of FormTableColumnDefinition from a JSON string
form_table_column_definition_instance = FormTableColumnDefinition.from_json(json)
# print the JSON string representation of the object
print(FormTableColumnDefinition.to_json())

# convert the object into a dict
form_table_column_definition_dict = form_table_column_definition_instance.to_dict()
# create an instance of FormTableColumnDefinition from a dict
form_table_column_definition_from_dict = FormTableColumnDefinition.from_dict(form_table_column_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


