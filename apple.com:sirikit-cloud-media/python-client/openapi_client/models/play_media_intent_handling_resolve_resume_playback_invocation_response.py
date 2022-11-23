# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import ConfigDict, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List
from openapi_client.models.execution_metrics import ExecutionMetrics
from openapi_client.models.invocation_response import InvocationResponse
from openapi_client.models.object import object
from typing import Optional, Set
from typing_extensions import Self

class PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse(InvocationResponse):
    """
    PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse
    """ # noqa: E501
    method: StrictStr
    result: object
    __properties: ClassVar[List[str]] = ["debug", "method", "metrics", "result"]

    @field_validator('method')
    def method_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['PlayMediaIntentHandling.resolveResumePlayback']):
            raise ValueError("must be one of enum values ('PlayMediaIntentHandling.resolveResumePlayback')")
        return value

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
        """Create an instance of PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of metrics
        if self.metrics:
            _dict['metrics'] = self.metrics.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "debug": obj.get("debug"),
            "method": obj.get("method"),
            "metrics": ExecutionMetrics.from_dict(obj["metrics"]) if obj.get("metrics") is not None else None,
            "result": obj.get("result")
        })
        return _obj


