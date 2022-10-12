# coding: utf-8

"""
    PageSpeed Insights

    Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

    The version of the OpenAPI document: v4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.pagespeed_api_pagespeed_response_v4_formatted_results_rule_results_value import PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue
from typing import Optional, Set
from typing_extensions import Self

class PagespeedApiPagespeedResponseV4FormattedResults(BaseModel):
    """
    Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server.
    """ # noqa: E501
    locale: Optional[StrictStr] = Field(default=None, description="The locale of the formattedResults, e.g. \"en_US\".")
    rule_results: Optional[Dict[str, PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue]] = Field(default=None, description="Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.", alias="ruleResults")
    __properties: ClassVar[List[str]] = ["locale", "ruleResults"]

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
        """Create an instance of PagespeedApiPagespeedResponseV4FormattedResults from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each value in rule_results (dict)
        _field_dict = {}
        if self.rule_results:
            for _key_rule_results in self.rule_results:
                if self.rule_results[_key_rule_results]:
                    _field_dict[_key_rule_results] = self.rule_results[_key_rule_results].to_dict()
            _dict['ruleResults'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PagespeedApiPagespeedResponseV4FormattedResults from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "locale": obj.get("locale"),
            "ruleResults": dict(
                (_k, PagespeedApiPagespeedResponseV4FormattedResultsRuleResultsValue.from_dict(_v))
                for _k, _v in obj["ruleResults"].items()
            )
            if obj.get("ruleResults") is not None
            else None
        })
        return _obj


