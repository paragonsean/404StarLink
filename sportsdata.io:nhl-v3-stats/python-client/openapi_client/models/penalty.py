# coding: utf-8

"""
    NHL v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Penalty(BaseModel):
    """
    Penalty
    """ # noqa: E501
    bench_penalty_served_by_player_id: Optional[StrictInt] = Field(default=None, alias="BenchPenaltyServedByPlayerID")
    description: Optional[StrictStr] = Field(default=None, alias="Description")
    drawn_by_player_id: Optional[StrictInt] = Field(default=None, alias="DrawnByPlayerID")
    drawn_by_team_id: Optional[StrictInt] = Field(default=None, alias="DrawnByTeamID")
    is_bench_penalty: Optional[StrictBool] = Field(default=None, alias="IsBenchPenalty")
    penalized_player_id: Optional[StrictInt] = Field(default=None, alias="PenalizedPlayerID")
    penalized_team_id: Optional[StrictInt] = Field(default=None, alias="PenalizedTeamID")
    penalty_id: Optional[StrictInt] = Field(default=None, alias="PenaltyID")
    penalty_minutes: Optional[StrictInt] = Field(default=None, alias="PenaltyMinutes")
    period_id: Optional[StrictInt] = Field(default=None, alias="PeriodID")
    sequence: Optional[StrictInt] = Field(default=None, alias="Sequence")
    time_remaining_minutes: Optional[StrictInt] = Field(default=None, alias="TimeRemainingMinutes")
    time_remaining_seconds: Optional[StrictInt] = Field(default=None, alias="TimeRemainingSeconds")
    __properties: ClassVar[List[str]] = ["BenchPenaltyServedByPlayerID", "Description", "DrawnByPlayerID", "DrawnByTeamID", "IsBenchPenalty", "PenalizedPlayerID", "PenalizedTeamID", "PenaltyID", "PenaltyMinutes", "PeriodID", "Sequence", "TimeRemainingMinutes", "TimeRemainingSeconds"]

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
        """Create an instance of Penalty from a JSON string"""
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
        # set to None if bench_penalty_served_by_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.bench_penalty_served_by_player_id is None and "bench_penalty_served_by_player_id" in self.model_fields_set:
            _dict['BenchPenaltyServedByPlayerID'] = None

        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['Description'] = None

        # set to None if drawn_by_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.drawn_by_player_id is None and "drawn_by_player_id" in self.model_fields_set:
            _dict['DrawnByPlayerID'] = None

        # set to None if drawn_by_team_id (nullable) is None
        # and model_fields_set contains the field
        if self.drawn_by_team_id is None and "drawn_by_team_id" in self.model_fields_set:
            _dict['DrawnByTeamID'] = None

        # set to None if is_bench_penalty (nullable) is None
        # and model_fields_set contains the field
        if self.is_bench_penalty is None and "is_bench_penalty" in self.model_fields_set:
            _dict['IsBenchPenalty'] = None

        # set to None if penalized_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.penalized_player_id is None and "penalized_player_id" in self.model_fields_set:
            _dict['PenalizedPlayerID'] = None

        # set to None if penalized_team_id (nullable) is None
        # and model_fields_set contains the field
        if self.penalized_team_id is None and "penalized_team_id" in self.model_fields_set:
            _dict['PenalizedTeamID'] = None

        # set to None if penalty_minutes (nullable) is None
        # and model_fields_set contains the field
        if self.penalty_minutes is None and "penalty_minutes" in self.model_fields_set:
            _dict['PenaltyMinutes'] = None

        # set to None if sequence (nullable) is None
        # and model_fields_set contains the field
        if self.sequence is None and "sequence" in self.model_fields_set:
            _dict['Sequence'] = None

        # set to None if time_remaining_minutes (nullable) is None
        # and model_fields_set contains the field
        if self.time_remaining_minutes is None and "time_remaining_minutes" in self.model_fields_set:
            _dict['TimeRemainingMinutes'] = None

        # set to None if time_remaining_seconds (nullable) is None
        # and model_fields_set contains the field
        if self.time_remaining_seconds is None and "time_remaining_seconds" in self.model_fields_set:
            _dict['TimeRemainingSeconds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Penalty from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "BenchPenaltyServedByPlayerID": obj.get("BenchPenaltyServedByPlayerID"),
            "Description": obj.get("Description"),
            "DrawnByPlayerID": obj.get("DrawnByPlayerID"),
            "DrawnByTeamID": obj.get("DrawnByTeamID"),
            "IsBenchPenalty": obj.get("IsBenchPenalty"),
            "PenalizedPlayerID": obj.get("PenalizedPlayerID"),
            "PenalizedTeamID": obj.get("PenalizedTeamID"),
            "PenaltyID": obj.get("PenaltyID"),
            "PenaltyMinutes": obj.get("PenaltyMinutes"),
            "PeriodID": obj.get("PeriodID"),
            "Sequence": obj.get("Sequence"),
            "TimeRemainingMinutes": obj.get("TimeRemainingMinutes"),
            "TimeRemainingSeconds": obj.get("TimeRemainingSeconds")
        })
        return _obj


