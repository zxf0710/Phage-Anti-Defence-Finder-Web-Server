import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPsychologicalfactors(query) {
  return request({
    url: '/system/psychologicalfactors/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPsychologicalfactors(elderlyId) {
  return request({
    url: '/system/psychologicalfactors/' + elderlyId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPsychologicalfactors(data) {
  return request({
    url: '/system/psychologicalfactors',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePsychologicalfactors(data) {
  return request({
    url: '/system/psychologicalfactors',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPsychologicalfactors(elderlyId) {
  return request({
    url: '/system/psychologicalfactors/' + elderlyId,
    method: 'delete'
  })
}
