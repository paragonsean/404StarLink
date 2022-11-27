# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.segment_dimensions_behavior import SegmentDimensionsBehavior
from openapi_client.models.segment_dimensions_demographic import SegmentDimensionsDemographic
from openapi_client.models.segment_dimensions_location import SegmentDimensionsLocation
from typing import Optional, Set
from typing_extensions import Self

class SegmentDimensions(BaseModel):
    """
    Specifies the dimension settings for a segment.
    """ # noqa: E501
    attributes: Optional[Any] = Field(default=None, alias="Attributes")
    behavior: Optional[SegmentDimensionsBehavior] = Field(default=None, alias="Behavior")
    demographic: Optional[SegmentDimensionsDemographic] = Field(default=None, alias="Demographic")
    location: Optional[SegmentDimensionsLocation] = Field(default=None, alias="Location")
    metrics: Optional[Any] = Field(default=None, alias="Metrics")
    user_attributes: Optional[Any] = Field(default=None, alias="UserAttributes")
    __properties: ClassVar[List[str]] = ["Attributes", "Behavior", "Demographic", "Location", "Metrics", "UserAttributes"]

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
        """Create an instance of SegmentDimensions from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of behavior
        if self.behavior:
            _dict['Behavior'] = self.behavior.to_dict()
        # override the default output from pydantic by calling `to_dict()` of demographic
        if self.demographic:
            _dict['Demographic'] = self.demographic.to_dict()
        # override the default output from pydantic by calling `to_dict()` of location
        if self.location:
            _dict['Location'] = self.location.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SegmentDimensions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Attributes": obj.get("Attributes"),
            "Behavior": SegmentDimensionsBehavior.from_dict(obj["Behavior"]) if obj.get("Behavior") is not None else None,
            "Demographic": SegmentDimensionsDemographic.from_dict(obj["Demographic"]) if obj.get("Demographic") is not None else None,
            "Location": SegmentDimensionsLocation.from_dict(obj["Location"]) if obj.get("Location") is not None else None,
            "Metrics": obj.get("Metrics"),
            "UserAttributes": obj.get("UserAttributes")
        })
        return _obj


