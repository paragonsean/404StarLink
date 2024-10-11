

# Severity

<p>The severity of the finding.</p> <p>The finding provider can provide the initial severity. The finding provider can only update the severity if it hasn't been updated using <code>BatchUpdateFindings</code>.</p> <p>The finding must have either <code>Label</code> or <code>Normalized</code> populated. If only one of these attributes is populated, then Security Hub automatically populates the other one. If neither attribute is populated, then the finding is invalid. <code>Label</code> is the preferred attribute.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | [**Double**](Double.md) |  |  [optional] |
|**label** | [**SeverityLabel**](SeverityLabel.md) |  |  [optional] |
|**normalized** | [**Integer**](Integer.md) |  |  [optional] |
|**original** | [**String**](String.md) |  |  [optional] |



