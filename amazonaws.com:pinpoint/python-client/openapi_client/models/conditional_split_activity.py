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
from openapi_client.models.conditional_split_activity_condition import ConditionalSplitActivityCondition
from openapi_client.models.conditional_split_activity_evaluation_wait_time import ConditionalSplitActivityEvaluationWaitTime
from typing import Optional, Set
from typing_extensions import Self

class ConditionalSplitActivity(BaseModel):
    """
    <p>Specifies the settings for a yes/no split activity in a journey. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.</p> <note><p>To create yes/no split activities that send participants down different paths based on push notification events (such as Open or Received events), your mobile app has to specify the User ID and Endpoint ID values. For more information, see <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/integrate.html\">Integrating Amazon Pinpoint with your application</a> in the <i>Amazon Pinpoint Developer Guide</i>.</p></note>
    """ # noqa: E501
    condition: Optional[ConditionalSplitActivityCondition] = Field(default=None, alias="Condition")
    evaluation_wait_time: Optional[ConditionalSplitActivityEvaluationWaitTime] = Field(default=None, alias="EvaluationWaitTime")
    false_activity: Optional[Any] = Field(default=None, alias="FalseActivity")
    true_activity: Optional[Any] = Field(default=None, alias="TrueActivity")
    __properties: ClassVar[List[str]] = ["Condition", "EvaluationWaitTime", "FalseActivity", "TrueActivity"]

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
        """Create an instance of ConditionalSplitActivity from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of condition
        if self.condition:
            _dict['Condition'] = self.condition.to_dict()
        # override the default output from pydantic by calling `to_dict()` of evaluation_wait_time
        if self.evaluation_wait_time:
            _dict['EvaluationWaitTime'] = self.evaluation_wait_time.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ConditionalSplitActivity from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Condition": ConditionalSplitActivityCondition.from_dict(obj["Condition"]) if obj.get("Condition") is not None else None,
            "EvaluationWaitTime": ConditionalSplitActivityEvaluationWaitTime.from_dict(obj["EvaluationWaitTime"]) if obj.get("EvaluationWaitTime") is not None else None,
            "FalseActivity": obj.get("FalseActivity"),
            "TrueActivity": obj.get("TrueActivity")
        })
        return _obj


