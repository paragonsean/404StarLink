# coding: utf-8

"""
    Soccer v3 Stats

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
from openapi_client.models.dfs_slate_game import DfsSlateGame
from openapi_client.models.dfs_slate_player import DfsSlatePlayer
from typing import Optional, Set
from typing_extensions import Self

class DfsSlate(BaseModel):
    """
    DfsSlate
    """ # noqa: E501
    competition_id: Optional[StrictInt] = Field(default=None, alias="CompetitionId")
    dfs_slate_games: Optional[List[DfsSlateGame]] = Field(default=None, alias="DfsSlateGames")
    dfs_slate_players: Optional[List[DfsSlatePlayer]] = Field(default=None, alias="DfsSlatePlayers")
    is_multi_day_slate: Optional[StrictBool] = Field(default=None, alias="IsMultiDaySlate")
    number_of_games: Optional[StrictInt] = Field(default=None, alias="NumberOfGames")
    operator: Optional[StrictStr] = Field(default=None, alias="Operator")
    operator_day: Optional[StrictStr] = Field(default=None, alias="OperatorDay")
    operator_game_type: Optional[StrictStr] = Field(default=None, alias="OperatorGameType")
    operator_name: Optional[StrictStr] = Field(default=None, alias="OperatorName")
    operator_slate_id: Optional[StrictInt] = Field(default=None, alias="OperatorSlateID")
    operator_start_time: Optional[StrictStr] = Field(default=None, alias="OperatorStartTime")
    removed_by_operator: Optional[StrictBool] = Field(default=None, alias="RemovedByOperator")
    salary_cap: Optional[StrictInt] = Field(default=None, alias="SalaryCap")
    slate_id: Optional[StrictInt] = Field(default=None, alias="SlateID")
    slate_roster_slots: Optional[List[Optional[StrictStr]]] = Field(default=None, alias="SlateRosterSlots")
    __properties: ClassVar[List[str]] = ["CompetitionId", "DfsSlateGames", "DfsSlatePlayers", "IsMultiDaySlate", "NumberOfGames", "Operator", "OperatorDay", "OperatorGameType", "OperatorName", "OperatorSlateID", "OperatorStartTime", "RemovedByOperator", "SalaryCap", "SlateID", "SlateRosterSlots"]

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
        """Create an instance of DfsSlate from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in dfs_slate_games (list)
        _items = []
        if self.dfs_slate_games:
            for _item_dfs_slate_games in self.dfs_slate_games:
                if _item_dfs_slate_games:
                    _items.append(_item_dfs_slate_games.to_dict())
            _dict['DfsSlateGames'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in dfs_slate_players (list)
        _items = []
        if self.dfs_slate_players:
            for _item_dfs_slate_players in self.dfs_slate_players:
                if _item_dfs_slate_players:
                    _items.append(_item_dfs_slate_players.to_dict())
            _dict['DfsSlatePlayers'] = _items
        # set to None if competition_id (nullable) is None
        # and model_fields_set contains the field
        if self.competition_id is None and "competition_id" in self.model_fields_set:
            _dict['CompetitionId'] = None

        # set to None if is_multi_day_slate (nullable) is None
        # and model_fields_set contains the field
        if self.is_multi_day_slate is None and "is_multi_day_slate" in self.model_fields_set:
            _dict['IsMultiDaySlate'] = None

        # set to None if number_of_games (nullable) is None
        # and model_fields_set contains the field
        if self.number_of_games is None and "number_of_games" in self.model_fields_set:
            _dict['NumberOfGames'] = None

        # set to None if operator (nullable) is None
        # and model_fields_set contains the field
        if self.operator is None and "operator" in self.model_fields_set:
            _dict['Operator'] = None

        # set to None if operator_day (nullable) is None
        # and model_fields_set contains the field
        if self.operator_day is None and "operator_day" in self.model_fields_set:
            _dict['OperatorDay'] = None

        # set to None if operator_game_type (nullable) is None
        # and model_fields_set contains the field
        if self.operator_game_type is None and "operator_game_type" in self.model_fields_set:
            _dict['OperatorGameType'] = None

        # set to None if operator_name (nullable) is None
        # and model_fields_set contains the field
        if self.operator_name is None and "operator_name" in self.model_fields_set:
            _dict['OperatorName'] = None

        # set to None if operator_slate_id (nullable) is None
        # and model_fields_set contains the field
        if self.operator_slate_id is None and "operator_slate_id" in self.model_fields_set:
            _dict['OperatorSlateID'] = None

        # set to None if operator_start_time (nullable) is None
        # and model_fields_set contains the field
        if self.operator_start_time is None and "operator_start_time" in self.model_fields_set:
            _dict['OperatorStartTime'] = None

        # set to None if removed_by_operator (nullable) is None
        # and model_fields_set contains the field
        if self.removed_by_operator is None and "removed_by_operator" in self.model_fields_set:
            _dict['RemovedByOperator'] = None

        # set to None if salary_cap (nullable) is None
        # and model_fields_set contains the field
        if self.salary_cap is None and "salary_cap" in self.model_fields_set:
            _dict['SalaryCap'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DfsSlate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "CompetitionId": obj.get("CompetitionId"),
            "DfsSlateGames": [DfsSlateGame.from_dict(_item) for _item in obj["DfsSlateGames"]] if obj.get("DfsSlateGames") is not None else None,
            "DfsSlatePlayers": [DfsSlatePlayer.from_dict(_item) for _item in obj["DfsSlatePlayers"]] if obj.get("DfsSlatePlayers") is not None else None,
            "IsMultiDaySlate": obj.get("IsMultiDaySlate"),
            "NumberOfGames": obj.get("NumberOfGames"),
            "Operator": obj.get("Operator"),
            "OperatorDay": obj.get("OperatorDay"),
            "OperatorGameType": obj.get("OperatorGameType"),
            "OperatorName": obj.get("OperatorName"),
            "OperatorSlateID": obj.get("OperatorSlateID"),
            "OperatorStartTime": obj.get("OperatorStartTime"),
            "RemovedByOperator": obj.get("RemovedByOperator"),
            "SalaryCap": obj.get("SalaryCap"),
            "SlateID": obj.get("SlateID"),
            "SlateRosterSlots": obj.get("SlateRosterSlots")
        })
        return _obj


