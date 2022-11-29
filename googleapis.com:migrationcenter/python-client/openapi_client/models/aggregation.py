# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.aggregation_histogram import AggregationHistogram
from typing import Optional, Set
from typing_extensions import Self

class Aggregation(BaseModel):
    """
    Message describing an aggregation. The message includes the aggregation type, parameters, and the field on which to perform the aggregation.
    """ # noqa: E501
    count: Optional[Dict[str, Any]] = Field(default=None, description="Object count.")
    var_field: Optional[StrictStr] = Field(default=None, description="The name of the field on which to aggregate.", alias="field")
    frequency: Optional[Dict[str, Any]] = Field(default=None, description="Frequency distribution of all field values.")
    histogram: Optional[AggregationHistogram] = None
    sum: Optional[Dict[str, Any]] = Field(default=None, description="Sum of field values.")
    __properties: ClassVar[List[str]] = ["count", "field", "frequency", "histogram", "sum"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Aggregation from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of histogram
        if self.histogram:
            _dict['histogram'] = self.histogram.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Aggregation from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "count": obj.get("count"),
            "field": obj.get("field"),
            "frequency": obj.get("frequency"),
            "histogram": AggregationHistogram.from_dict(obj["histogram"]) if obj.get("histogram") is not None else None,
            "sum": obj.get("sum")
        })
        return _obj


